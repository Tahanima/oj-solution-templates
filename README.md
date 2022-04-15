# OJ Problem Templates
A repository containing solution templates for problems of various automated online judges.

## Project Structure
```
oj-problem-templates/
├─ .gitignore
├─ README.md
├─ src/
   ├─ io/
      ├─ github/
         ├─ tahanima/
            ├─ codechef/
               ├─ ...
            ├─ uva/
               ├─ ...
```

## Usage

1. Get a copy of [oj-problem-templates](https://github.com/Tahanima/oj-problem-templates) by clicking the <kbd><b>Fork</b></kbd> button.
2. Clone, i.e, download your copy of the repository to your local machine using
```bash
git clone https://github.com/[your_username]/oj-problem-templates.git
```
3. Open the project in [IntelliJ IDEA](https://www.jetbrains.com/idea/).
4. Code the solution for your preferred problem.
5. Make sure to remove the package definition in the online judge's code editor while submitting the solution in order to avoid any compilation error.

## Example Solution

Solution using the [UVa 13025 - Back to the Past](/src/io/github/tahanima/uva/_13025/Main.java) template.

```java
package io.github.tahanima.uva._13025;

public class Main {

    /**
     * @return a string containing the answer
     */
    public static String solve() {
        // Implement this method

        return "May 29, 2013 Wednesday";
    }

    /**
     * Takes care of the problem's input and output.
     */
    public static void main(String[] args) {
        System.out.println(solve());
    }
}
```

## Available Templates

<details>
    <summary><b>CodeChef</b></summary>
    <table>
        <tr>
            <th>#</th>
            <th>Problem Title</th>
            <th>Solution Template</th>
        </tr>
        <tr>
            <td>BATTERYLOW</td>
            <td>Battery Low</td>
            <td><a href="/src/io/github/tahanima/codechef/batterylow/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>COURSEREG</td>
            <td>Course Registration</td>
            <td><a href="/src/io/github/tahanima/codechef/coursereg/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>CREDSCORE</td>
            <td>Credit score</td>
            <td><a href="/src/io/github/tahanima/codechef/credscore/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>EMAILREM</td>
            <td>Email Reminders</td>
            <td><a href="/src/io/github/tahanima/codechef/emailrem/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>FBC</td>
            <td>Fill the Bucket</td>
            <td><a href="/src/io/github/tahanima/codechef/fbc/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>INCRIQ</td>
            <td>Increase IQ</td>
            <td><a href="/src/io/github/tahanima/codechef/incriq/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>INSTNOODLE</td>
            <td>Chef and Instant Noodles</td>
            <td><a href="/src/io/github/tahanima/codechef/instnoodle/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>TYRE</td>
            <td>Tyre problem</td>
            <td><a href="/src/io/github/tahanima/codechef/tyre/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>VOLCONTROL</td>
            <td>Volume Control</td>
            <td><a href="/src/io/github/tahanima/codechef/volcontrol/Main.java">[Link]</a></td>
        </tr>
    </table>
</details>

<details>
    <summary><b>UVa</b></summary>
    <table>
        <tr>
            <th>#</th>
            <th>Problem Title</th>
            <th>Solution Template</th>
        </tr>
        <tr>
            <td>401</td>
            <td>Palindromes</td>
            <td><a href="/src/io/github/tahanima/uva/_401/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>1124</td>
            <td>Celebrity jeopardy</td>
            <td><a href="/src/io/github/tahanima/uva/_1124/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>11044</td>
            <td>Searching for Nessy</td>
            <td><a href="/src/io/github/tahanima/uva/_11044/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>11172</td>
            <td>Relational Operator</td>
            <td><a href="/src/io/github/tahanima/uva/_11172/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>11547</td>
            <td>Automatic Answer</td>
            <td><a href="/src/io/github/tahanima/uva/_11547/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>11614</td>
            <td>Etruscan Warriors Never Play Chess</td>
            <td><a href="/src/io/github/tahanima/uva/_11614/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>11727</td>
            <td>Cost Cutting</td>
            <td><a href="/src/io/github/tahanima/uva/_11727/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>12250</td>
            <td>Language Detection</td>
            <td><a href="/src/io/github/tahanima/uva/_12250/Main.java">[Link]</a></td>
        </tr>
        <tr>
            <td>13025</td>
            <td>Back to the Past</td>
            <td><a href="/src/io/github/tahanima/uva/_13025/Main.java">[Link]</a></td>
        </tr>
    </table>
</details>
