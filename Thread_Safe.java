class Thread_Safe extends Thread {

    private static Thread_Safe ob;
    public String str;
    private Thread_Safe(){
	str = "Hello World";
}
    
    synchronized public static Thread_Safe getInstance(){
        if(ob == null){
            ob = new Thread_Safe();
        }
        return ob;
    }
}
class temp3 {
    public static void main(String args[]){
	Thread_Safe a = Thread_Safe.getInstance();
	Thread_Safe b = Thread_Safe.getInstance();
	
	System.out.println("Object1: " + a.str);
	b.str = "Shivam Agarwal";
	System.out.println("After Changes:");
	System.out.println("Object1: " + a.str);
	System.out.println("Object2: " + b.str);
}
}
