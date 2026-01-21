package com.insurance;

import java.time.LocalDate;
import java.util.*;
public class InsurancePolicyManager{
    private Set<Policy> hashSet =new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet=new TreeSet<>(
            Comparator.comparing(Policy::getExpiryDate)
    );
    //add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    // Display all unique policies
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }
    // policies expiring within 30 days
    public void displayExpiringSoon() {
        LocalDate today =LocalDate.now();
        LocalDate limit =today.plusDays(30);
        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }
    // policies by coverage type
    public void displayByCoverage(String coverageType) {
        for (Policy p :hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(p);
            }
        }
    }
    //find duplicate policies by policy number
    public void findDuplicatePolicies(List<Policy> policies){
        Set<Integer> seen =new HashSet<>();
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println("Duplicate Policy: "+p);
            }
        }
    }
    // performance comparison
    public void performanceTest(Set<Policy> set, Policy policy){
        long start, end;
        start= System.nanoTime();
        set.add(policy);
        end =System.nanoTime();
        System.out.println("Add Time: "+(end -start) + " ns");
        start=System.nanoTime();
        set.contains(policy);
        end=System.nanoTime();
        System.out.println("Search Time: "+(end-start) + " ns");
        start=System.nanoTime();
        set.remove(policy);
        end =System.nanoTime();
        System.out.println("Remove Time: "+(end-start) + " ns");
    }
}
