(ns jetty-error-example.core
  (:require [ring.adapter.jetty :as jetty]))

(defn -main
  [& args]
  (jetty/run-jetty
   (fn handler [_]
     {:status 200
      :body "Working!"})

   {:max-threads 8 :min-threads 8
    :max-queued-requests 7 ; Change this to 8 and it works :|

    :port 300}))

; => Difficult to understand error without reading the source code
