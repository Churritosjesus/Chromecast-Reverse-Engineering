.class public Lbry;
.super Ljava/lang/Object;


# instance fields
.field final a:Lbrb;

.field final b:Lbsh;


# direct methods
.method public constructor <init>(Lbrb;)V
    .locals 1

    .prologue
    .line 5000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbry;->a:Lbrb;

    new-instance v0, Lbsh;

    invoke-direct {v0}, Lbsh;-><init>()V

    iput-object v0, p0, Lbry;->b:Lbsh;

    return-void
.end method


# virtual methods
.method public synthetic a()Lbb;
    .locals 1

    .prologue
    .line 4000
    invoke-virtual {p0}, Lbry;->b()Lbsh;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 3000
    const-string v0, "ga_dispatchPeriod"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbry;->b:Lbsh;

    iput p2, v0, Lbsh;->d:I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lbry;->a:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "Int xml configuration name not recognized"

    invoke-virtual {v0, v1, p1}, Lbql;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1000
    const-string v0, "ga_appName"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbry;->b:Lbsh;

    iput-object p2, v0, Lbsh;->a:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    const-string v0, "ga_appVersion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbry;->b:Lbsh;

    iput-object p2, v0, Lbsh;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v0, "ga_logLevel"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbry;->b:Lbsh;

    iput-object p2, v0, Lbsh;->c:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lbry;->a:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "String xml configuration name not recognized"

    invoke-virtual {v0, v1, p1}, Lbql;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 2000
    const-string v0, "ga_dryRun"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lbry;->b:Lbsh;

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, v1, Lbsh;->e:I

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbry;->a:Lbrb;

    invoke-virtual {v0}, Lbrb;->a()Lbql;

    move-result-object v0

    const-string v1, "Bool xml configuration name not recognized"

    invoke-virtual {v0, v1, p1}, Lbql;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public b()Lbsh;
    .locals 1

    .prologue
    .line 6000
    iget-object v0, p0, Lbry;->b:Lbsh;

    return-object v0
.end method
