(ns euclid.core)

(defn biggestSq
  "Euclid's algorithm of finding set of largest same-sized squares into which a reactangle can be divided."
  [w l]
  (loop [wid w
         len l]
    (let [big (max wid len) small (min wid len) diff (- big small)]
      (if (= diff 0)
        small ;; return the side of the biggest square into which the given rectangle can be divided.
        (recur small diff)))))
