.class Lbqm;
.super Landroid/content/BroadcastReceiver;


# static fields
.field static final a:Ljava/lang/String;


# instance fields
.field final b:Lbrb;

.field c:Z

.field d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lbqm;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbqm;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lbrb;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lbqm;->b:Lbrb;

    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 0
    .line 6000
    iget-object v0, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    .line 7000
    iget-object v0, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v0}, Lbrb;->c()Lbqu;

    .line 0
    return-void
.end method

.method private e()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 0
    .line 12000
    iget-object v0, p0, Lbqm;->b:Lbrb;

    .line 13000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    const-string v2, "connectivity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 0
    invoke-direct {p0}, Lbqm;->d()V

    iget-boolean v0, p0, Lbqm;->c:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    .line 4000
    :cond_0
    iget-object v0, p0, Lbqm;->b:Lbrb;

    .line 5000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const-string v1, "com.google.analytics.RADIO_POWERED"

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-direct {p0}, Lbqm;->e()Z

    move-result v0

    iput-boolean v0, p0, Lbqm;->d:Z

    iget-object v0, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "Registering connectivity change receiver. Network connected"

    iget-boolean v2, p0, Lbqm;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbql;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbqm;->c:Z

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 0
    .line 8000
    iget-boolean v0, p0, Lbqm;->c:Z

    .line 0
    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "Unregistering connectivity change receiver"

    invoke-virtual {v0, v1}, Lbql;->b(Ljava/lang/String;)V

    iput-boolean v2, p0, Lbqm;->c:Z

    iput-boolean v2, p0, Lbqm;->d:Z

    .line 9000
    iget-object v0, p0, Lbqm;->b:Lbrb;

    .line 10000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11000
    iget-object v1, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v1}, Lbrb;->a()Lbql;

    move-result-object v1

    .line 0
    const-string v2, "Failed to unregister the network broadcast receiver"

    invoke-virtual {v1, v2, v0}, Lbql;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method c()Landroid/content/Context;
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbqm;->b:Lbrb;

    .line 14000
    iget-object v0, v0, Lbrb;->a:Landroid/content/Context;

    .line 0
    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 0
    invoke-direct {p0}, Lbqm;->d()V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v1}, Lbrb;->a()Lbql;

    move-result-object v1

    const-string v2, "NetworkBroadcastReceiver received action"

    invoke-virtual {v1, v2, v0}, Lbql;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lbqm;->e()Z

    move-result v0

    iget-boolean v1, p0, Lbqm;->d:Z

    if-eq v1, v0, :cond_0

    iput-boolean v0, p0, Lbqm;->d:Z

    .line 1000
    iget-object v1, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v1}, Lbrb;->c()Lbqu;

    move-result-object v1

    .line 0
    invoke-virtual {v1, v0}, Lbqu;->a(Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "com.google.analytics.RADIO_POWERED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v0, Lbqm;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2000
    iget-object v0, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v0}, Lbrb;->c()Lbqu;

    move-result-object v0

    .line 3000
    const-string v1, "Radio powered up"

    invoke-virtual {v0, v1}, Lbqu;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lbqu;->b()V

    goto :goto_0

    .line 0
    :cond_2
    iget-object v1, p0, Lbqm;->b:Lbrb;

    invoke-virtual {v1}, Lbrb;->a()Lbql;

    move-result-object v1

    const-string v2, "NetworkBroadcastReceiver received unknown action"

    invoke-virtual {v1, v2, v0}, Lbql;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method
