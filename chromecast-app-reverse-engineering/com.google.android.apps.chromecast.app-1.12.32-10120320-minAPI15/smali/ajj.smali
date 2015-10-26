.class final Lajj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Landroid/content/Context;

.field private synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 777
    iput-object p1, p0, Lajj;->a:Ljava/lang/String;

    iput-object p2, p0, Lajj;->b:Landroid/content/Context;

    iput-object p3, p0, Lajj;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 780
    iget-object v0, p0, Lajj;->a:Ljava/lang/String;

    invoke-static {v0}, Laji;->e(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 781
    if-eqz v0, :cond_0

    .line 782
    iget-object v1, p0, Lajj;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Laji;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lajn;

    .line 784
    iget-object v1, p0, Lajj;->b:Landroid/content/Context;

    const-string v2, "com.facebook.internal.preferences.APP_SETTINGS"

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 787
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lajj;->c:Ljava/lang/String;

    .line 788
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 789
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 792
    :cond_0
    invoke-static {}, Laji;->a()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 793
    return-void
.end method
