.class final Lbji;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbjh;


# direct methods
.method constructor <init>(Lbjh;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lbji;->a:Lbjh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 87
    iget-object v0, p0, Lbji;->a:Lbjh;

    invoke-static {v0}, Lbjh;->a(Lbjh;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lbji;->a:Lbjh;

    invoke-static {v0}, Lbjh;->b(Lbjh;)Lbjk;

    move-result-object v0

    invoke-interface {v0}, Lbjk;->z()Lbdu;

    move-result-object v0

    iget-object v7, p0, Lbji;->a:Lbjh;

    .line 1301
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v2

    .line 1302
    new-instance v4, Lbdq;

    iget-object v1, v0, Lbdu;->d:Ljava/lang/String;

    const/16 v5, 0x90

    .line 2046
    iget v6, v0, Lbdm;->c:I

    .line 1304
    invoke-direct {v4, v1, v5, v6}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 3042
    const/4 v1, 0x1

    iput v1, v4, Lbfp;->h:I

    .line 1306
    const-string v1, "pollOtaStatus"

    sget v5, Lbew;->c:I

    new-instance v6, Lbet;

    invoke-direct {v6, v0, v7, v4}, Lbet;-><init>(Lbdu;Lbdn;Lbdq;)V

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 92
    :goto_0
    return-void

    .line 90
    :cond_0
    iget-object v0, p0, Lbji;->a:Lbjh;

    invoke-static {v0}, Lbjh;->c(Lbjh;)Lblp;

    goto :goto_0
.end method
