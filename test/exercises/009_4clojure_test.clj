(ns exercises.009-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= #{1 2 3 4} (conj #{1 4 3} 2)))))

;; https://www.4clojure.com/problem/9
;; When operating on a set, the conj function returns a new set with one or
;; more keys "added".
