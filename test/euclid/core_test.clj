(ns euclid.core-test
  (:require [clojure.test :refer :all]
            [euclid.core :refer :all]))

(deftest biggestSq-test
  (testing "FIXME, I fail."
    (is (= (biggestSq 25 25) 25))
    (is (= (biggestSq 25 20) 5))
    (is (= (biggestSq 230 170) 10))))