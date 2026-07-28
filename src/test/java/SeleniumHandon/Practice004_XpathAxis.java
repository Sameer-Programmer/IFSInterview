package SeleniumHandon;

public class Practice004_XpathAxis {
    /*
    | XPath                                                  | Result           | Description                                                                                                     |
| ------------------------------------------------------ | ---------------- | --------------------------------------------------------------------------------------------------------------- |
| `//td[text()='Germany']/self::td`                      | **Germany**      | Returns the **same element** (current node).                                                                    |
| `//tr/child::td[text()='Germany']`                     | **Germany**      | Returns the **direct child `<td>`** of the `<tr>` whose text is **Germany**.                                    |
| `//tr/descendant::td[text()='Germany']`                | **Germany**      | Returns the **descendant `<td>`** (all levels below the `<tr>`).                                                |
| `//td[text()='Maria Anders']/following-sibling::td[1]` | **Germany**      | Returns the **immediate right sibling** on the **same row (same level)**.                                       |
| `//td[text()='Maria Anders']/following::td[1]`         | **Germany**      | Returns the **first `<td>` that appears after** the current `<td>` in the document (same row or lower levels).  |
| `//td[text()='Germany']/preceding-sibling::td[1]`      | **Maria Anders** | Returns the **immediate left sibling** on the **same row (same level)**.                                        |
| `//td[text()='Germany']/preceding::td[1]`              | **Maria Anders** | Returns the **first `<td>` that appears before** the current `<td>` in the document (same row or upper levels). |

     */
}
