
/* Set up local 'Postgres v11'
*  1. start postgres server from 'Application'
*  2. start psql shell with 'postgres/'    (empty password)
*    -> /Applications/Postgres.app/Contents/Versions/11/bin/psql --port=5433 -U postgres
*
*    common commands within the shell
*    postgres=# \du           # list existing users
*    postgres=# \l            # list databases
*  3. Exit psql
*    postgres=# \q
*
* */

object QuickExample {

  def main(args: Array[String]): Unit = {
    println(" --------------- QuickExample ---------------")

  }
}
