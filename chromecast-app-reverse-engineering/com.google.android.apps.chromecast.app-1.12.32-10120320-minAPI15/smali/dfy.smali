.class public final Ldfy;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ldfq;

.field public final b:Ljava/lang/String;

.field public final c:Ldfo;

.field public final d:Ldga;

.field final e:Ljava/lang/Object;

.field private volatile f:Ljava/net/URL;

.field private volatile g:Ljava/net/URI;

.field private volatile h:Ldfb;


# direct methods
.method constructor <init>(Ldfz;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1120
    iget-object v0, p1, Ldfz;->a:Ldfq;

    .line 40
    iput-object v0, p0, Ldfy;->a:Ldfq;

    .line 2120
    iget-object v0, p1, Ldfz;->b:Ljava/lang/String;

    .line 41
    iput-object v0, p0, Ldfy;->b:Ljava/lang/String;

    .line 3120
    iget-object v0, p1, Ldfz;->c:Ldfp;

    .line 42
    invoke-virtual {v0}, Ldfp;->a()Ldfo;

    move-result-object v0

    iput-object v0, p0, Ldfy;->c:Ldfo;

    .line 4120
    iget-object v0, p1, Ldfz;->d:Ldga;

    .line 43
    iput-object v0, p0, Ldfy;->d:Ldga;

    .line 5120
    iget-object v0, p1, Ldfz;->e:Ljava/lang/Object;

    .line 44
    if-eqz v0, :cond_0

    .line 6120
    iget-object v0, p1, Ldfz;->e:Ljava/lang/Object;

    .line 44
    :goto_0
    iput-object v0, p0, Ldfy;->e:Ljava/lang/Object;

    .line 45
    return-void

    :cond_0
    move-object v0, p0

    .line 44
    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Ldfy;->c:Ldfo;

    invoke-virtual {v0, p1}, Ldfo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/net/URL;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Ldfy;->f:Ljava/net/URL;

    .line 53
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ldfy;->a:Ldfq;

    invoke-virtual {v0}, Ldfq;->a()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Ldfy;->f:Ljava/net/URL;

    goto :goto_0
.end method

.method public final b()Ljava/net/URI;
    .locals 2

    .prologue
    .line 58
    :try_start_0
    iget-object v0, p0, Ldfy;->g:Ljava/net/URI;

    .line 59
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ldfy;->a:Ldfq;

    invoke-virtual {v0}, Ldfq;->b()Ljava/net/URI;

    move-result-object v0

    iput-object v0, p0, Ldfy;->g:Ljava/net/URI;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    .line 61
    new-instance v1, Ljava/io/IOException;

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()Ldfz;
    .locals 1

    .prologue
    .line 94
    new-instance v0, Ldfz;

    .line 7120
    invoke-direct {v0, p0}, Ldfz;-><init>(Ldfy;)V

    .line 94
    return-object v0
.end method

.method public final d()Ldfb;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Ldfy;->h:Ldfb;

    .line 103
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ldfy;->c:Ldfo;

    invoke-static {v0}, Ldfb;->a(Ldfo;)Ldfb;

    move-result-object v0

    iput-object v0, p0, Ldfy;->h:Ldfb;

    goto :goto_0
.end method

.method public final e()Z
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Ldfy;->a:Ldfq;

    .line 7345
    iget-object v0, v0, Ldfq;->a:Ljava/lang/String;

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 107
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request{method="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldfy;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldfy;->a:Ldfq;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Ldfy;->e:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    iget-object v0, p0, Ldfy;->e:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
