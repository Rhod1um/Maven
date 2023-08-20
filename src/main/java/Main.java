import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        //her er ikke  valgt maven i start up menuen når man laver nyt projekt da vi tilføjer det senere
        //ingen pom fil pga ingen maven så ingen hjælp til at hente nogle ekstra ting (her stringUtils)
        //erik søger på stringUtils og ser man skal bruge maven
        //højreklik på roden og tryk add framework og vælg maven, så
        //får ma pom fil
        //maven er en del af ci/cd flow, det køre i skyen, derfor
        //skal vi importere maven for ci/cd
        //når man importere maven hentes det fra skyen? og det importere java libraries
        //som man skal bruge til en masse ting
        //nu er <dependencies>
        //        <dependency>
        //            <groupId>org.apache.commons</groupId>
        //            <artifactId>commons-lang3</artifactId>
        //            <version>3.12.0</version>
        //        </dependency>
        //    </dependencies>
        //sat ind i pom filen og maven reloades og så kan man nemt importere StringUtils

        //maven giver ressoruces folder og test og target
        //når man køre et javaprogram får man en .class fil fra en .java fil
        //i venstre side ser man også en folder target -> classes + generatedSources
        //clean fjerner ovenstående, fjerner compileret kode, det kan være godt hvis
        //intellij driller
        //Man kan trykke på Main under target -> classes. Det er den compilerede
        //class fil. Tryk på den så dekompileres den til javakode
        //i højre side - filnavn -> lifecycle -> clean
        //i docker pakkes alle .class filer sammen til en jar fil

        //validate i højre side hjælper med gramma fejl i pom filen
        //compile kompilere det
        //test laver unit test. Den køre alle unit tests der er.

        //ved test i højre side fanger den ikke at vores test skulle fejle.
        //^^gør testklassen og testmetoden public ellers kan den ikke finde det

        //i cd/ci pipeline så køre den det der står ude i højre side under maven
        //derfor skal vi kende til det

        //erik kørte kommandoen $mvn test i intelllij terminalen og kunne køre
        //det der svarer til test i højre side, men det virker ikke her for man skal
        //have installeret maven på sin computer ud over at have det i intellij for
        //at kunne køre maven kommandoer i terminalen
        //så skal man også downloade javac. som det er nu er det kun gennem intellij
        //der er javac

        //%JAVA_HOME% er en env variabel som viser hvor javac ligger
        //echo %JAVA_HOME% viser stien, eller set JAVA_HOME

        //lav unit test auto: højreklik i klasse -> generate -> test

        //i testmode skal ci/cd køre H2 database da den ligger i skyen på github. Den har
        //ikke adgang til vores egen database

        //erik viser hvordan man laver og køre javafiler og class filer i kommandline

        System.out.println("Hello world!");

        String s1 = StringUtils.chop("hej med dig");
        System.out.println(s1);

    }
}