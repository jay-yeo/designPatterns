package observer;

public class Main {

    public static void main(String[] args) {

        // Create Job Recruistment Company
        Recruiter firstRecruiter = new Recruiter();
        Recruiter secondRecruiter = new Recruiter();
        firstRecruiter.registerObserver(new JobSeeker("Zsolt"));
        firstRecruiter.registerObserver(new JobSeeker("Mate"));
        secondRecruiter.registerObserver(new JobSeeker("Jason"));
        secondRecruiter.registerObserver(new JobSeeker("Tamas"));

        //Each time, a new job is added, all registered job seekers will get noticed.
        firstRecruiter.addJob("Java developer");
        firstRecruiter.addJob("Software developer");
        secondRecruiter.addJob("Automation developer");


        // Create Job Portal Website
        JobPortal topJobs = new JobPortal();
        topJobs.registerObserver(new JobHopper("Fred"));

        topJobs.addJob("CEO");
        topJobs.addJob("Financial Analyst");

    }
}