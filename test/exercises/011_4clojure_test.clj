(ns exercises.011-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3])))))

;; https://www.4clojure.com/problem/11
;; When operating on a map, the conj function returns a new map with one or
;; more key-value pairs "added".
