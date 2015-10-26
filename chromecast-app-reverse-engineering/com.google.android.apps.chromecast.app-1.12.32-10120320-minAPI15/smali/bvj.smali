.class public final Lbvj;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Lbvk;

.field public final f:Lcmy;

.field public g:Z

.field public final synthetic h:Lbvh;


# direct methods
.method public constructor <init>(Lbvh;Lbvk;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lbvj;-><init>(Lbvh;[BLbvk;)V

    return-void
.end method

.method private constructor <init>(Lbvh;[BLbvk;)V
    .locals 4

    .prologue
    .line 0
    iput-object p1, p0, Lbvj;->h:Lbvh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lbvj;->h:Lbvh;

    invoke-static {v0}, Lbvh;->a(Lbvh;)I

    move-result v0

    iput v0, p0, Lbvj;->a:I

    iget-object v0, p0, Lbvj;->h:Lbvh;

    invoke-static {v0}, Lbvh;->b(Lbvh;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbvj;->b:Ljava/lang/String;

    iget-object v0, p0, Lbvj;->h:Lbvh;

    invoke-static {v0}, Lbvh;->c(Lbvh;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbvj;->c:Ljava/lang/String;

    iget-object v0, p0, Lbvj;->h:Lbvh;

    invoke-static {v0}, Lbvh;->d(Lbvh;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbvj;->d:Ljava/lang/String;

    new-instance v0, Lcmy;

    invoke-direct {v0}, Lcmy;-><init>()V

    iput-object v0, p0, Lbvj;->f:Lcmy;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbvj;->g:Z

    invoke-static {p1}, Lbvh;->c(Lbvh;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbvj;->c:Ljava/lang/String;

    invoke-static {p1}, Lbvh;->d(Lbvh;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbvj;->d:Ljava/lang/String;

    iget-object v0, p0, Lbvj;->f:Lcmy;

    invoke-static {p1}, Lbvh;->e(Lbvh;)Lcac;

    move-result-object v1

    invoke-interface {v1}, Lcac;->a()J

    move-result-wide v2

    iput-wide v2, v0, Lcmy;->a:J

    iget-object v0, p0, Lbvj;->f:Lcmy;

    invoke-static {p1}, Lbvh;->f(Lbvh;)Lbvl;

    iget-object v1, p0, Lbvj;->f:Lcmy;

    iget-wide v2, v1, Lcmy;->a:J

    .line 1000
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    int-to-long v2, v1

    .line 0
    iput-wide v2, v0, Lcmy;->c:J

    iput-object p3, p0, Lbvj;->e:Lbvk;

    return-void
.end method
