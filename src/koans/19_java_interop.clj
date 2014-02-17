(meditations
  "You may have done more with Java than you know"
  (= String (class "warfare")) ; hint: try typing (javadoc "warfare") in the REPL

  "The dot signifies easy and direct Java interoperation"
  (= "SELECT * FROM" (.toUpperCase "select * from"))

  "But instance method calls are very different from normal functions"
  (= ["SELECT" "FROM" "WHERE"] (map (fn [x] (.toUpperCase x)) ["select" "from" "where"]))

  "shorter way to do"
  (= ["SELECT" "FROM" "WHERE"] (map #(.toUpperCase %) ["select" "from" "where"]))

  "even shorter"
  (memfn .toUpperCase)
  (= ["SELECT" "FROM" "WHERE"] (map (memfn toUpperCase) ["select" "from" "where"]))


  "
  Initial value pass to construct
  Constructing might be harder than breaking"
  (= 10 (let [latch (java.util.concurrent.CountDownLatch. 10)]
          (.getCount latch)))

  "
  TODO: use recursive to compute
 Static methods are slashing prices!"
  (== 1024 (Math/pow 2 10)))
