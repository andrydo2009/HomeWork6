public class Main {
    public static void main(String[] args) {
        System.out.println("Mission 6.1.1");
        for ( int b = 0; b < 11; b++ )
        { System.out.println("Iterazia = " + b);}

        System.out.println(" ");
        System.out.println("Mission 6.1.2");
        for ( int f = 10; f > 0; f-- )
        { System.out.println("Iterazia = " + f);}

        System.out.println(" ");
        System.out.println("Mission 6.1.3");
        for ( int z = 0; z < 18; z+=2 )
        { System.out.println("Iterazia = " + z);}

        System.out.println(" ");
        System.out.println("Mission 6.1.4");
        for ( int f = 10; f > -11; f-- )
        { System.out.println("Iterazia = " + f);}

        System.out.println(" ");
        System.out.println("Mission 6.2.1");
        for (int g = 1904; g<=2096; g+=4)
        { int ostat=g/4;
            if (ostat==0) {}
            {System.out.println(" Висоскосный год= " + g);}
        }

        System.out.println(" ");
        System.out.println("Mission 6.2.2");
        for ( int z = 7; z <= 98; z+=7 )
        { System.out.println("Число = " + z);}

        System.out.println(" ");
        System.out.println("Mission 6.2.3");
        for ( int k = 1; k<= 512; k*=2 )
        { System.out.println("Число = " + k);}


        System.out.println(" ");
        System.out.println("Mission 6.3.1");
        int vklad=29000;
        int total=0;
        for ( int x=0;x<=12; x++ )
        {total+=vklad;
            System.out.println("Месяц " + x + " сумма накоплений " + total + " рублей" );}

        System.out.println(" ");
        System.out.println("Mission 6.3.2");
        int vkladToo=29000;
        int totalToo=0;
        for ( int y=0;y<=12; y++ )
        {
            totalToo=(totalToo+vkladToo)+(vkladToo/100);
            System.out.println("Месяц " + y + " сумма накоплений на банковском счете " + totalToo + " рублей" );}


    }
}

// the end