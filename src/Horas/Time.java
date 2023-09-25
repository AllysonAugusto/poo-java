package Horas;

class Time {
    private int hour;
    private int minute;
    private int second;

    // Construtor da classe
    public Time(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public void setHour(int hour){
        if (hour >= 24){
            System.out.println("Fail: hora inválida.");
        } else {
            this.hour = hour; //Modificando o valor que tava com o que eu recebi
        }
    }

    public void setMinute (int minute){
        if (minute >= 60) {
            System.out.println("Fail: minuto inválido.");
        } else {
            this.minute = minute; //Modificando o valor que tava com o que
        }
    }


    public void setSecond(int second){
        if (minute >= 60){
            System.out.println("Fail: segundo inválido.");
        } else{
            this.second = second; //Modificando o valor que tava com o que
        }
    }

    public int getHour(){
        return this.hour; //pegando o métdo setHour e retornando
    }

    public int getMinute(){
        return this.minute; //pegando o método setMinute e retornando

    }

    public int getSecond(){
        return this.second; //pegando o método setSecond e retornando
    }

    public void imprimindoHora(){
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second); //valor inteiro (d) deve ser formatado com pelo menos dois caracteres (02). Se o valor tiver menos de dois dígitos, zeros à esquerda serão usados para preencher o espaço. Por exemplo, se o valor for 5, será formatado como "05". Se o valor for 12, será mantido como "12".
    }

    public void incrementandoHorario(){
    // Incrementa o segundo atual
    this.second++;
    
    // Verifica se os segundos ultrapassaram 59 (60 segundos em um minuto)
    if (this.second >= 60) {
        // Zera os segundos e incrementa os minutos
        this.second = 0;
        this.minute++;
        
        // Verifica se os minutos ultrapassaram 59 (60 minutos em uma hora)
        if (this.minute >= 60) {
            // Zera os minutos e incrementa as horas
            this.minute = 0;
            // Usando o operador módulo (%) para garantir que as horas permaneçam dentro do intervalo de 0 a 23
            this.hour = (this.hour + 1) % 24;
        }
    }

    }
}
