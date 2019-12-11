package dubs;

public class principal {
    public static void main(String[] args) throws InterruptedException {

        //MultiThread

        // * Par héritage (moins souple)
        MonThread monThread = new MonThread();
        monThread.start();

        //Par implémentation de l'interface runnable
        //avec création d'une classe qui implémente
        new Thread(new MonThread2()).start();

        //utilisation d'une classe anonyme
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("bla bla bla");
            }
        });

        //Lambda expression
        new Thread(() -> System.out.println("coucou cou cou cou")).start();

        //pour provoquer l'endormissement d'un Thread
        // on peut invoquer la méthode #Sleep sur le Thread proprement dit
        //Thread.sleep(1000) puis ajouter la capture de l'exception
        //et pour intérrompre un thread on peut utiliser la méthode interupt sur le thread

        //Attendre la fin d'un thread
        //Utilisation de Join qui permet d'attendre qu'un thread se termine
        Cuisinier c1 = new Cuisinier("Casser les oeufs et battre");
        Cuisinier c2 = new Cuisinier("Rajouter du chocolat");

        Thread t1 = new Thread(c1);
        t1.start();
        Thread t2 = new Thread(c2);
        t2.start();

        //laisser le thread correspondant un traitement en cours pour éviter des problèmes
        t1.join();
        t2.join();

        System.out.println("Réaliser l'appareil...");

        //Définir les méthodes de la classe thread
        Cuisinier c3 = new Cuisinier("Casser les oeufs et battre");
        Cuisinier c4 = new Cuisinier("Rajouter du chocolat");

        Thread t3 = new Thread(c3, "Fabien");
        Thread t4 = new Thread(c4, "Lolo");

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("mélange a la fin");

        //etreinte fatale ou dead locks
        //Créer deux cuisinier c1 et c2 avec la classe cuisinier
        //Contenant une méthode travailler pour permettre a un cuisinier
        //De faire appel au service de l'autre
        //Puis le cuisinier C1 fera travailler C2 et vice versa
        //CEci créera un pronlème
        //le problème est causé par l'utilisation exessif
        // de la méthode Synchronized sur plusieurs méthodes


        //Utilisation des blocs gardés
        //Bloqué le thread sur une instruction avec la méthode wait()
        //notify ==> débloquer un seul thread sous le wait()
        //notifyAll ==> débloquer tous les thread sous le wait()

        //ReenntrantLock()

        //java.util.concurrent
        //Executor : s'utilise comme Thread : appel une méthode execute (Runnable)
        //utilisation probable d'un thread existant

        //ExecutorServoice est une sous interface, submit (Runnable) ou callable
        //retour possible

        //ScheduleExecutorService sous interface lance des tâches avec des délais et des répétitions
        //Les executor ne ferment pa sautomatiquement et il leur faut un shutdown

        //Pool de thread
        //maintient les thread en fonctionnement

        //ForkJoinPool -- spécialement pour le multithread
        //pour les algo par récursivité



    }
}
