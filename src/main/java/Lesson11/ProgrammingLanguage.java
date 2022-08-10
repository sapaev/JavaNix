package Lesson11;

public enum ProgrammingLanguage {
    JS, TS("My favorite language"),
    JAVA, C("STRONG"),
    CPLUSPLUS, CSHARP, RUBY, PHP("PHP"), GO, KOTLIN;

    String value;
    ProgrammingLanguage(){
        this.value="not so bad";
    }
    ProgrammingLanguage(String str) {
        this.value = str;
    }
}
