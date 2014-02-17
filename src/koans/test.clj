(defmacro infix-better [form]
  `(~(second form) ; Note the syntax-quote (`) and unquote (~) characters!
    ~(first form)
    ~(nth form 2) ))

(macroexpand '(infix-better (10 * 2)))
(partition 3 [:a :b :c :d :e])
(group-by count ["hello" "world" "foo" "bar"])
(group-by odd? [1 2 3 4 5])
