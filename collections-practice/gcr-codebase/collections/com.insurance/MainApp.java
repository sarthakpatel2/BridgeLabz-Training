package com.insurance;

import java.time.LocalDate;
import java.util.*;
public class MainApp{
    public static void main(String[] args){
        InsurancePolicyManager manager=new InsurancePolicyManager();
        Policy p1= new Policy(101, "Sanjh",LocalDate.now().plusDays(20),"Health",5000);
        Policy p2= new Policy(102, "Ayushi",LocalDate.now().plusDays(45),"Finance",3000);
        Policy p3=new Policy(103,"Avantika",LocalDate.now().plusDays(10),"Home",7000);
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        System.out.println("\nAll Policies ---");
        manager.displayAllPolicies();
        System.out.println("\nPolicies Expiring in 30 Days ---");
        manager.displayExpiringSoon();
        System.out.println("\nHealth Policies ---");
        manager.displayByCoverage("Health");
        System.out.println("\nPerformance Comparison ---");
        manager.performanceTest(new HashSet<>(), p1);
        manager.performanceTest(new LinkedHashSet<>(), p1);
        manager.performanceTest(new TreeSet<>(Comparator.comparing(Policy::getExpiryDate)), p1);
    }
}
