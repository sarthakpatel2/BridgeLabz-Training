import java.util.*;
class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;
    HistoryNode(String url){
        this.url= url;
        this.prev= null;
        this.next=null;
    }
}
class BrowserTab {
    private HistoryNode current;
    // visit a new page
    public void visit(String url){
        HistoryNode newNode =new HistoryNode(url);
        if (current !=null){
            current.next=newNode;
            newNode.prev=current;
        }
        current=newNode;
        System.out.println("Visited: "+url);
    }
    //  to go back
    public void back(){
        if (current !=null && current.prev !=null){
            current=current.prev;
            System.out.println("Back to: "+current.url);
        } else {
            System.out.println("No previous page");
        }
    }
    // to go forward
    public void forward(){
        if (current!= null &&current.next!=null){
            current=current.next;
            System.out.println("Forward to: "+current.url);
        }else{
            System.out.println("No forward page");
        }
    }
    public String getCurrentPage(){
        return current !=null ?current.url:"Empty Tab";
    }
}
//BrowserBuddy
public class BrowserBuddy{
    private Stack<BrowserTab> closedTabs=new Stack<>();
    private BrowserTab currentTab;
    //to open a new tab
    public void openNewTab(){
        currentTab=new BrowserTab();
        System.out.println("New tab opened");
    }
    // close  the current tab
    public void closeTab(){
        if (currentTab !=null) {
            closedTabs.push(currentTab);
            currentTab =null;
            System.out.println("Tab closed");
        }
    }
    // to restore last closed tab
    public void restoreTab() {
        if (!closedTabs.isEmpty()){
            currentTab=closedTabs.pop();
            System.out.println("Tab restored. Current page: "+currentTab.getCurrentPage());
        }else{
            System.out.println("No closed tabs to restore");
        }
    }
    public BrowserTab getCurrentTab(){
        return currentTab;
    }
    //Main----
    public static void main(String[] args){
        BrowserBuddy browser= new BrowserBuddy();
        browser.openNewTab();
        BrowserTab tab=browser.getCurrentTab();
        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("youtube.com");
        tab.back();
        tab.back();
        tab.forward();
        browser.closeTab();
        browser.restoreTab();
    }
}
