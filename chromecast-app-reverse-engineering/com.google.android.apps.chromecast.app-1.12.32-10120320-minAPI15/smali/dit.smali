.class final Ldit;
.super Ldkg;
.source "PG"


# instance fields
.field private synthetic a:Ldis;


# direct methods
.method constructor <init>(Ldis;Ldkv;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Ldit;->a:Ldis;

    invoke-direct {p0, p2}, Ldkg;-><init>(Ldkv;)V

    return-void
.end method


# virtual methods
.method public final a(Ldjz;J)J
    .locals 6

    .prologue
    const-wide/16 v0, -0x1

    .line 56
    iget-object v2, p0, Ldit;->a:Ldis;

    .line 1037
    iget v2, v2, Ldis;->a:I

    .line 56
    if-nez v2, :cond_1

    .line 60
    :cond_0
    :goto_0
    return-wide v0

    .line 57
    :cond_1
    iget-object v2, p0, Ldit;->a:Ldis;

    .line 2037
    iget v2, v2, Ldis;->a:I

    .line 57
    int-to-long v2, v2

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-super {p0, p1, v2, v3}, Ldkg;->a(Ldjz;J)J

    move-result-wide v2

    .line 58
    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    .line 59
    iget-object v0, p0, Ldit;->a:Ldis;

    iget-object v1, p0, Ldit;->a:Ldis;

    .line 3037
    iget v1, v1, Ldis;->a:I

    .line 59
    int-to-long v4, v1

    sub-long/2addr v4, v2

    long-to-int v1, v4

    .line 4037
    iput v1, v0, Ldis;->a:I

    move-wide v0, v2

    .line 60
    goto :goto_0
.end method
