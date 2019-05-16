(defproject {{name}} "1.0.0-SNAPSHOT"
  :description "Coasting On Clojure"
  :urls "https://yourorghere.org/yourprojhere"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [coast-framework/coast.theta "1.5.0"]
                 [org.xerial/sqlite-jdbc "3.25.2"]]
  :plugins [[lein-tools-deps "0.4.5"]] ; this enables the use of lein & deps.edn for best of both worlds
  ; why use both? lein is the incumbent and well known, deps.edn allows you to use git repos as dependencies rather than published jars at clojars.org or maven | this is the glue
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project "../resources/deps.edn"]}
  )
