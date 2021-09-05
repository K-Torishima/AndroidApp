import java.text.SimpleDateFormat
import java.util.*

// Dateをよしなに使いやすいようにするClass

class DateUtil {
    companion object {
        // APIのStringDateをDate型に変換します。
        fun toDate(parameter: String): Date {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz", Locale.JAPAN)
            val toDate = try {
                dateFormat.parse(parameter)
            } catch (t: Throwable) {
                null
            }
            return toDate ?: Date()
        }

        /*
        - ↑のmethodで変換したDateをパーツごとに分解して変換でるようにし、汎用性を持たせます。
        - 使用する場合は、レイアウトファイルで連結して使うと良いと思います。
        */

        // 年
        fun toYear(date: Date): String {
            val formatYear = SimpleDateFormat("yyyy", Locale.JAPAN)
            val toYear = try {
                formatYear.format(date)
            } catch (t: Throwable) {
                null
            }
            return toYear ?: ""
        }

        // 月
        fun toMonth(date: Date): String {
            val formatMonth = SimpleDateFormat("M", Locale.JAPAN)

            val toMonth = try {
                formatMonth.format(date)
            } catch (t: Throwable) {
                null
            }
            return toMonth ?: ""
        }

        // 日
        fun toDay(date: Date): String {
            val formatDay = SimpleDateFormat("d", Locale.JAPAN)
            val toDay = try {
                formatDay.format(date)
            } catch (t: Throwable) {
                null
            }
            return toDay ?: ""
        }

        // 曜日（"曜日"はつかない）
        fun toDayOfWeek(date: Date): String {
            val formatDayOfWeek = SimpleDateFormat("E", Locale.JAPAN)
            val toDayOfWeek = try {
                formatDayOfWeek.format(date)
            } catch (t: Throwable) {
                null
            }
            return toDayOfWeek ?: ""
        }
    }
}


/* 
使い方

// 最初にString → Dateに変換したいものをDateUtil.toDateで変換
// あとは変換したものを各methodの引数に入れてあげるだけ

``` 
    private fun test(date: String) {
        Log.d("normal", oderAt)

        val toDate = DateUtil.toDate(date))
        println(toDate1)

        val toYear = DateUtil.toYear(toDate)
        println(toYear)
        val toMonth = DateUtil.toMonth(toDate)
        println(toMonth)
        val toDay = DateUtil.toDay(toDate)
        println(toDay)
        val toDayOfWeek = DateUtil.toDayOfWeek(toDate)
        println("($toDayOfWeek)")
        
        println(all)

```

*/