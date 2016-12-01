(ns exercises.003-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= "HELLO WORLD" (.toUpperCase "hello world")))))

;; https://www.4clojure.com/problem/3
;; Clojure strings are Java strings. This means that you can use any of
;; the Java string methods on Clojure strings.
