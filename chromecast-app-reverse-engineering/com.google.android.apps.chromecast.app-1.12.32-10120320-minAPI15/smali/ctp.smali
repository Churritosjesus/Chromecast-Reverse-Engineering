.class final Lctp;
.super Ljava/lang/Object;

# interfaces
.implements Lctq;


# instance fields
.field private synthetic a:Z

.field private synthetic b:Lcto;


# direct methods
.method constructor <init>(Lcto;Z)V
    .locals 0

    iput-object p1, p0, Lctp;->b:Lcto;

    iput-boolean p2, p0, Lctp;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lctk;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 0
    iget-boolean v2, p0, Lctp;->a:Z

    if-eqz v2, :cond_2

    .line 1000
    iget-wide v2, p1, Lctk;->b:J

    .line 0
    const-wide/32 v4, 0x2932e00

    add-long/2addr v2, v4

    iget-object v4, p0, Lctp;->b:Lcto;

    .line 2000
    iget-object v4, v4, Lcto;->a:Lcac;

    .line 0
    invoke-interface {v4}, Lcac;->a()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    .line 4000
    :cond_2
    iget-wide v2, p1, Lctk;->b:J

    .line 3000
    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    move v2, v0

    .line 0
    :goto_1
    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    move v2, v1

    .line 3000
    goto :goto_1
.end method
