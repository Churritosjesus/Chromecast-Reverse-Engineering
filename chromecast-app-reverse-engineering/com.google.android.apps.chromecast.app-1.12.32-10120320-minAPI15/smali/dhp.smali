.class public final Ldhp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldku;


# instance fields
.field public final a:Ldjz;

.field private b:Z

.field private final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, -0x1

    invoke-direct {p0, v0}, Ldhp;-><init>(I)V

    .line 43
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    iput-object v0, p0, Ldhp;->a:Ldjz;

    .line 38
    iput p1, p0, Ldhp;->c:I

    .line 39
    return-void
.end method


# virtual methods
.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Ldkw;->b:Ldkw;

    return-object v0
.end method

.method public final a(Ldku;)V
    .locals 6

    .prologue
    .line 76
    new-instance v1, Ldjz;

    invoke-direct {v1}, Ldjz;-><init>()V

    .line 77
    iget-object v0, p0, Ldhp;->a:Ldjz;

    const-wide/16 v2, 0x0

    iget-object v4, p0, Ldhp;->a:Ldjz;

    .line 5060
    iget-wide v4, v4, Ldjz;->b:J

    .line 77
    invoke-virtual/range {v0 .. v5}, Ldjz;->a(Ldjz;JJ)Ldjz;

    .line 6060
    iget-wide v2, v1, Ldjz;->b:J

    .line 78
    invoke-interface {p1, v1, v2, v3}, Ldku;->a_(Ldjz;J)V

    .line 79
    return-void
.end method

.method public final a_(Ldjz;J)V
    .locals 6

    .prologue
    .line 55
    iget-boolean v0, p0, Ldhp;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3060
    :cond_0
    iget-wide v0, p1, Ldjz;->b:J

    .line 56
    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Ldgs;->a(JJJ)V

    .line 57
    iget v0, p0, Ldhp;->c:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ldhp;->a:Ldjz;

    .line 4060
    iget-wide v0, v0, Ldjz;->b:J

    .line 57
    iget v2, p0, Ldhp;->c:I

    int-to-long v2, v2

    sub-long/2addr v2, p2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 58
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "exceeded content-length limit of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldhp;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 60
    :cond_1
    iget-object v0, p0, Ldhp;->a:Ldjz;

    invoke-virtual {v0, p1, p2, p3}, Ldjz;->a_(Ldjz;J)V

    .line 61
    return-void
.end method

.method public final close()V
    .locals 4

    .prologue
    .line 46
    iget-boolean v0, p0, Ldhp;->b:Z

    if-eqz v0, :cond_1

    .line 52
    :cond_0
    return-void

    .line 47
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldhp;->b:Z

    .line 48
    iget-object v0, p0, Ldhp;->a:Ldjz;

    .line 1060
    iget-wide v0, v0, Ldjz;->b:J

    .line 48
    iget v2, p0, Ldhp;->c:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 49
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "content-length promised "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldhp;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " bytes, but received "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ldhp;->a:Ldjz;

    .line 2060
    iget-wide v2, v2, Ldjz;->b:J

    .line 50
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final flush()V
    .locals 0

    .prologue
    .line 64
    return-void
.end method
