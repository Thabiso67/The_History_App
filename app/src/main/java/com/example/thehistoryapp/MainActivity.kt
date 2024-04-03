package com.example.thehistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.lang.Error
import kotlin.math.E

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val EditText: EditText = findViewById(R.id.editTextNumber)
        val Generate: Button = findViewById(R.id.button1)
        val Clear: Button = findViewById(R.id.clear_text)
        val EnterYourAgeTextView: TextView = findViewById(R.id.textview1)
        val TextView: TextView = findViewById(R.id.textView2)
        val ImageView: ImageView = findViewById(R.id.imageView1)
        val ImageView2: ImageView = findViewById(R.id.imageView2)

        Clear.setOnClickListener { EditText.text.clear() }
        
       // 
        Generate.setOnClickListener {
            val EditText = EditText.text.toString()

            if (EditText == "20") {
                TextView.text =
                    "You are the same age as Cameron Boyce who was an actor. His acting debut was in 2008 at nine years of age in the film Mirrors. He wasn't just an actor but also a talented dancer."

            } else if (EditText == "21") {
                TextView.text =
                    "You are the same age as Duncan Edwards who was a football player. He is a legend of Manchester. He wa the youngest player to player in the Football League First Division and the yougest post WW2 player to play for the England National Team."

            } else if (EditText == "22") {
                TextView.text =
                    "You are the same age as Aaliyah who was an RnB singer. She was signed to Blackground Records at the young age of twelve. Her debut album Age ain't Nothing but a Number sold three million copies in the US and wa certified double- platinum."

            } else if (EditText == "23") {
                TextView.text =
                    "You are the same age as Technoblade who was a YouTuber. He had over 16 million subscribers for his comedic Minecraft videos which are loved by so many young and old people around the world. Funfact: on Youtube if you type his channel name and search, Youtube will ask you did you mean, 'Technoblade never dies'."

            } else if (EditText == "24") {
                TextView.text =
                    "You are the same age as Notorious B.I.G. als known as Biggie Smalls who was a rapper. He is regarded as one greatest rappers of all time. He won Rap Artist of the Year in 1995. His songs are still very much played today around the world."

            } else if (EditText == "25") {
                TextView.text =
                    "You are the same age as Tupac Shakur also known as 2Pac whos was a rapper. During the 1990's he was the most popular rapper. He had four albums between 1991 and 1996 which sold 75 million copies worldwide. He is regarded as the greatest rapper of all time."

            } else if (EditText == "26") {
                TextView.text =
                    "You are the same age as Mac Miller who was a Rapper. He rose to fame in 2011 after his debut album Blue Slide Park was the U.S Billboard 200. He taught himself how to play piano, guitar, drums, and bass as a young teenager."

            } else if (EditText == "27") {
                TextView.text =
                    "You are the same age as Kurt Cobain who was a rock singer. He was also a guitarist of the late 1980s band Nirvana best known for their breakthrough album 'Nevermind'. Their album went five-times Platinum."

            } else if (EditText == "28") {
                TextView.text =
                    "You are the same age as Avicci who was a DJ. He was Grammy award nominee known for his international hits such as 'Levels', 'Hey Brother', 'Wake me up and more'. His debut album 'True' was Top ten in more than 15 countries."

            } else if (EditText == "29") {
                TextView.text =
                    "You are the same age as Lance Cade who was a Pro wrestler. He was a three a time WWE tag-team champion. He was part of WWE's developmental leagues."

            } else if (EditText == "30") {
                TextView.text =
                    "You are the same age as Princess Diane who was the queen of Wales. She was an advocate for so many people around her. She was associated with numerous charity organizations which helped with multiple causes. She was always praised for her charisma and friendly personality."

            } else if (EditText == "31") {
                TextView.text =
                    "You are the same age as Christian Atsu who was a professional footballer. He began his pro career with FC Porto in 2011 after coming through the youth squad."

            } else if (EditText == "32") {
                TextView.text =
                    "You are the same age as Bruce Lee who was a Martial Arts actor. Well known throughout the, Lee was was an generational icon known for films and his epic martial arts skills."

            } else if (EditText == "33") {
                TextView.text =
                    "You are the same age Naya Rivera who was an actress.She had her first acting role in at 4 years old on the famous TV series The Royal Family."

            } else if (EditText == "34") {
                TextView.text =
                    "You are the same age as Riky Rick who was a rapper. Loved by many South Africans, Riky Rick produced songs produced many hit songs throughout his career which. He was also know for his kindness for people around him. "

            } else if (EditText == "35") {
                TextView.text =
                    "You are the same age as AKA who was a rapper. Also loved by many South Africans, AKA produced many memorable which will remembered for a long time to come. His love for his home country and its people captured the hearts of many South Africans. "

            } else if (EditText == "36") {
                TextView.text =
                    " You are the same age as Bob Marley who was a Reggae Singer. An international music icon, Marley was known for spreading messages of peace and for oppression to stop through his music. He touched many hearts with his words of wisdom."

            } else if (EditText == "37") {
                TextView.text =
                    "You are the same age as Lou Gehrig who was a Baseball player. He is a Baseball Hall of Famer having being a seven time All Star, six time World Series Champion and two time AL MVP. He was known as the 'Iron Horse after playing 2130 consecutively. "

            } else if (EditText == "38") {
                TextView.text =
                    "You are the same age as Anthony Johnson who was an Mixed martial arts fighter. His nickname was 'Rumble' because in most of the fights he's won ended in a knockout. It was pretty ironic considering how much of kind hearted soul he was.  "

            } else if (EditText == "39") {
                TextView.text =
                    "Your are the same age as Martin Luther King Jr who was a civil rights activist. He received the Nobel Peace Prize in 1964 for his fight for the rights of African-American. He helped found the Southern Christian Leadership Conference and led the 1955 Montgomery Bus Boycott. "

            } else if (EditText == "40") {
                TextView.text =
                    "You are the same age as Paul Walker who was an actor. He was loved by many around the world for his role as Brian O'Conner in The Fast and Furious movie Franchise. In 2001 he won the Hollywood Breakthrough Award for New Male Stylemaker. "

            } else if (EditText == "41") {
                TextView.text =
                    " You are the same age as Chester Bennington who was a rock singer. He was the lead vocalist of the world famous rock band Linkin Park. His band's album, Hybrid Theory from the year 2000 was certified Diamond. He also had a single with Linkin Park 'Numb which was certified Platinum in 2003. "

            } else if (EditText == "42") {
                TextView.text =
                    "You are the same age as Dorothy Dandridge who was an actress. She was not just a talented actress but also a great singer. She was best known for her lead role in Carmen Jones for which she earned a Golden Globe Award for Best Actress in 1954"

            } else if (EditText == "43") {
                TextView.text =
                    "You are the same age as Chadwick Boseman who was a movie actor. He had a lead role playing Marvel's Black Panther which was loved by many people around the world. He also portrayed RnB singer James Brown in 2014 movie Get On Up. "

            } else if (EditText == "44") {
                TextView.text =
                    "You are the same age as Billie Holiday who was a Jazz Singer. She received many awards throughout her career including being inducted to Grammy Award Hall of Fame. She is the singer of infamous such as Strange Fruit, Easy Living and Lady Sings the Blues."

            } else if (EditText == "45") {
                TextView.text =
                    "You are the same age as Freddie Mercury who was a Rock Singer. He was the lead singer of the rock group Queen. He wrote songs that are forever remembered by people such Bohemain Rhapsody and We are the Champions. He was also praised for having such a remarkable vocal range. "

            } else if (EditText == "46") {
                TextView.text =
                    "You are the same age as Andre The Giant who was a Pro Wrestler. He was a wrestling icon who stood at 7'4 and weighed 238,1 KG. He was a WWF Champion, WWF World Tag Team Champion and was a WWF Hall of Fame Inductee. Due to his size he was regarded as The Eighth Wonder of the World."

            } else if (EditText == "47") {
                TextView.text =
                    "You are the same age Judy Garland who was an actress. She played the iconic character Dorothy in The Wizard of Oz. She was the youngest winner of the Cecil B award DeMille Award at the young age of 39 years of age. "

            } else if (EditText == "48") {
                TextView.text =
                    "You are the same age as Whitney Houston who was an RnB Singer. Probably the most iconic female RnB and Pop singer, Whitney became the most awarded female singer in history for hit songs such I Wanna Dance with Somebody and I Will Always Love You."

            } else if (EditText == "49") {
                TextView.text =
                    "You are the same age as Garrincha who was a football player. Garricha was a Foward staring for Botafogo for which he scored 232 goals in 581 games. He played for the Brazilian national alongside Pele. The national team had never lost a match when they both were in the starting lineup."

            } else if (EditText == "50") {
                TextView.text =
                    "You are the same age as Michael Jackson who was a Pop Singer. The King of Pop was an absolute icon becoming the most successful singer in US history producing many memorable hit songs. He was not just a great singer but also an excellent dancer who invented the iconic Moon Walk. There will certainly be never anyone like him ever."

            } else {
                TextView.text = "Hmmm that can't be right. Please enter the right age."

            }
        }
    }
}
