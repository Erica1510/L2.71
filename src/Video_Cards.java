
import java.io.IOException;

//Класс Video_Cards представляет видеокарту и содержит информацию о продуктовом коде, названии,
// производителе,  техническом процессе, потреблении энергии и цене видеокарты.
public class Video_Cards {
    public int product_code;
    public String name;
    public String producer;
    public int technicalProcess;
    public int energyConsum;
    public float price;

    //возвращает продуктовый код видеокарты.
    public int getProduct_code() {
        return this.product_code;
    }

    // устанавливает продуктовый код видеокарты.
    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    //возвращает название видеокарты.
    public String getName() {
        return this.name;
    }

    //устанавливает название видеокарты.
    public void setName(String name) {
        this.name = name;
    }

    //возвращает производителя видеокарты.
    public String getProducer() {
        return this.producer;
    }

    //устанавливает производителя видеокарты.
    public void setProducer(String producer) {
        this.producer = producer;
    }

    //возвращает технический процесс видеокарты.
    public int getTechnicalProcess() {
        return this.technicalProcess;
    }

    //устанавливает технический процесс видеокарты.
    public void setTechnicalProcess(int technicalProcess) {
        this.technicalProcess = technicalProcess;
    }

    //возвращает потребление энергии видеокартой.
    public int getEnergyConsum() {
        return this.energyConsum;
    }

    //устанавливает потребление энергии видеокартой.
    public void setEnergyConsum(int energyConsum) {
        this.energyConsum = energyConsum;
    }

    //возвращает цену видеокарты
    public float getPrice() {
        return this.price;
    }

    //устанавливает цену видеокарты.
    public void setPrice(float price) {
        this.price = price;
    }

    //конструктор по умолчанию
    public Video_Cards() {}
    //конструктор копирования
    public Video_Cards(Video_Cards video_Cards){
        this.product_code=video_Cards.product_code;
        this.name=video_Cards.name;
        this.producer=video_Cards.producer;
        this.technicalProcess=video_Cards.technicalProcess;
        this.energyConsum=video_Cards.energyConsum;
        this.price=video_Cards.price;
    }
    //конструктор, принимающий аргументы.
    public Video_Cards(int product_code, String name, String producer, int technicalProcess, int energyConsum, float price) {
        this.product_code = product_code;
        this.name = name;
        this.producer = producer;
        this.technicalProcess = technicalProcess;
        this.energyConsum = energyConsum;
        this.price = price;
    }

    //метод, который сравнивает текущий объект с другим объектом на равенство.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video_Cards that)) return false;
        return product_code== that.product_code && name.equals(that.name)&&producer.equals(that.producer)
                &&technicalProcess== that.technicalProcess&&energyConsum== that.energyConsum&&price== that.price;
    }

    //метод, который возвращает хеш-код текущего объекта.
    @Override
    public int hashCode() {
        return product_code;
    }

    //Метод clone() создает и возвращает новый объект типа Video_Cards,
// используя конструктор копирования и передавая ему текущий объект.
    public Video_Cards clone() {
        return new Video_Cards(this);
    }
    //Метод equals() сравнивает поля двух объектов типа Video_Cards и возвращает true,
// если все поля совпадают, в противном случае возвращает false.
    public boolean equals(Video_Cards other) {
        return (this.product_code == other.product_code && this.name.equals(other.name) &&
                this.producer.equals(other.producer) && this.technicalProcess == other.technicalProcess &&
                this.energyConsum == other.energyConsum && this.price == other.price);
    }
    //Метод read() считывает данные видеокарты из Scanner и создает и возвращает
// новый объект типа Video_Cards с этими данными.
// Метод чтения из потока
    public void read(String line) {
        String[] parts = line.split(" ");
        this.product_code = Integer.parseInt(parts[0]);
        this.name = parts[1];
        this.producer = parts[2];
        this.technicalProcess = Integer.parseInt(parts[3]);
        this.energyConsum = Integer.parseInt(parts[4]);
        this.price = Float.parseFloat(parts[5]);
    }
    //Метод write() выводит данные видеокарты в консоль.
    public void write(Appendable out) throws IOException {
        out.append(String.format("%d %s %s %d %d %.2f",
                this.product_code, this.name, this.producer, this.technicalProcess, this.energyConsum, this.price));
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %d %.2f", this.product_code, this.name, this.producer, this.technicalProcess, this.energyConsum, this.price);
    }
}