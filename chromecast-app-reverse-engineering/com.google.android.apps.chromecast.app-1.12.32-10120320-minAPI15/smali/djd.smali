.class final Ldjd;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:J

.field private synthetic c:Ldjb;


# direct methods
.method varargs constructor <init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 1

    .prologue
    .line 360
    iput-object p1, p0, Ldjd;->c:Ldjb;

    iput p4, p0, Ldjd;->a:I

    iput-wide p5, p0, Ldjd;->b:J

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 363
    :try_start_0
    iget-object v0, p0, Ldjd;->c:Ldjb;

    iget-object v0, v0, Ldjb;->i:Ldid;

    iget v1, p0, Ldjd;->a:I

    iget-wide v2, p0, Ldjd;->b:J

    invoke-interface {v0, v1, v2, v3}, Ldid;->a(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 366
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
