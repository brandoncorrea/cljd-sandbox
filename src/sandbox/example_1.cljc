(ns sandbox.example-1)

(defmacro do-side-effect []
(prn "expanding do-side-effect:" (gensym)))

(do-side-effect)

(defn -main [])
