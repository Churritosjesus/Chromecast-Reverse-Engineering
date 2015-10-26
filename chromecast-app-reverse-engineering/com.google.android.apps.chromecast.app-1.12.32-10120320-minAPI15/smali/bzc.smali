.class final Lbzc;
.super Ljava/lang/Object;


# instance fields
.field final a:Lbzd;

.field final b:Ljava/util/Set;

.field c:I

.field d:Z

.field e:Landroid/os/IBinder;

.field final f:Lbzb;

.field g:Landroid/content/ComponentName;

.field final synthetic h:Lbza;


# direct methods
.method public constructor <init>(Lbza;Lbzb;)V
    .locals 1

    iput-object p1, p0, Lbzc;->h:Lbza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbzc;->f:Lbzb;

    new-instance v0, Lbzd;

    invoke-direct {v0, p0}, Lbzd;-><init>(Lbzc;)V

    iput-object v0, p0, Lbzc;->a:Lbzd;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbzc;->b:Ljava/util/Set;

    const/4 v0, 0x2

    iput v0, p0, Lbzc;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/ServiceConnection;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 0
    iget-object v0, p0, Lbzc;->h:Lbza;

    invoke-static {v0}, Lbza;->c(Lbza;)Lbzw;

    move-result-object v0

    iget-object v1, p0, Lbzc;->h:Lbza;

    invoke-static {v1}, Lbza;->b(Lbza;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbzc;->f:Lbzb;

    invoke-virtual {v2}, Lbzb;->a()Landroid/content/Intent;

    move-result-object v4

    .line 1000
    const-string v5, "CONNECT"

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lbzw;->a(Landroid/content/Context;Landroid/content/ServiceConnection;Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;)V

    .line 0
    iget-object v0, p0, Lbzc;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lbzc;->h:Lbza;

    invoke-static {v0}, Lbza;->c(Lbza;)Lbzw;

    move-result-object v0

    iget-object v1, p0, Lbzc;->h:Lbza;

    invoke-static {v1}, Lbza;->b(Lbza;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbzc;->f:Lbzb;

    invoke-virtual {v2}, Lbzb;->a()Landroid/content/Intent;

    move-result-object v3

    iget-object v4, p0, Lbzc;->a:Lbzd;

    const/16 v5, 0x81

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lbzw;->a(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    iput-boolean v0, p0, Lbzc;->d:Z

    iget-boolean v0, p0, Lbzc;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    iput v0, p0, Lbzc;->c:I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lbzc;->h:Lbza;

    invoke-static {v0}, Lbza;->c(Lbza;)Lbzw;

    move-result-object v0

    iget-object v1, p0, Lbzc;->h:Lbza;

    invoke-static {v1}, Lbza;->b(Lbza;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbzc;->a:Lbzd;

    invoke-virtual {v0, v1, v2}, Lbzw;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lbzc;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/ServiceConnection;)Z
    .locals 1

    iget-object v0, p0, Lbzc;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
