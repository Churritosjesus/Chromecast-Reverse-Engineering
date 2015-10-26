.class final Lbea;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lbdu;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:J

.field private synthetic d:Lbdn;


# direct methods
.method constructor <init>(Lbdu;Ljava/lang/String;JLbdn;)V
    .locals 1

    .prologue
    .line 400
    iput-object p1, p0, Lbea;->a:Lbdu;

    iput-object p2, p0, Lbea;->b:Ljava/lang/String;

    iput-wide p3, p0, Lbea;->c:J

    iput-object p5, p0, Lbea;->d:Lbdn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 403
    iget-object v0, p0, Lbea;->a:Lbdu;

    iget-object v1, p0, Lbea;->b:Ljava/lang/String;

    iget-wide v2, p0, Lbea;->c:J

    .line 1033
    invoke-virtual {v0, v1, v2, v3}, Lbdu;->a(Ljava/lang/String;J)Z

    move-result v0

    .line 403
    if-eqz v0, :cond_0

    .line 417
    :goto_0
    return-void

    .line 406
    :cond_0
    new-instance v4, Lbdr;

    iget-object v0, p0, Lbea;->a:Lbdu;

    .line 2033
    iget-object v0, v0, Lbdu;->d:Ljava/lang/String;

    .line 407
    invoke-direct {v4, v0}, Lbdr;-><init>(Ljava/lang/String;)V

    .line 408
    iget-object v0, p0, Lbea;->a:Lbdu;

    const-string v1, "getScanResults"

    iget-wide v2, p0, Lbea;->c:J

    iget-object v5, p0, Lbea;->a:Lbdu;

    .line 3033
    iget v5, v5, Lbdu;->e:I

    .line 408
    new-instance v6, Lbeb;

    iget-object v7, p0, Lbea;->d:Lbdn;

    invoke-direct {v6, p0, v7, v4}, Lbeb;-><init>(Lbea;Lbdn;Lbdr;)V

    invoke-static/range {v0 .. v6}, Lbdu;->a(Lbdu;Ljava/lang/String;JLbfp;ILbff;)V

    goto :goto_0
.end method
