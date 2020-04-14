public class Student{
    String name;
    double media;

    public Student(String name, double media){ //Método Construtor
        this.name = name; 

        if( media > 0.0 )
            if( media <= 100)
                this.media = media;
    }

    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    } 
    public void setMedia(){
        if( media > 0.0 )
            if( media <= 100)
                this.media = media;
    }
    public double getMedia(){
        return media;
    }

    public String getLetraNota(){
        if( media > 90.0)
            return "A";
        else if( media > 80.0)
            return "B";
        else if( media > 70.0)
            return "C";
        else if( media > 60.0)
            return "D";
        else
            return "F";
    }
}