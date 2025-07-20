(ns sandbox.core)

(defmacro defsym [value]
  `(def ~(gensym "defsym") ~value))

(defmacro list-syms []
  (let [{:keys [current-ns] :as nses} (:nses &env)
        symbols (->> (nses current-ns)
                     keys
                     (filter symbol?))]
    `(list ~@symbols)))

(defsym "the value")

(defn main []
  (prn (list-syms)))
