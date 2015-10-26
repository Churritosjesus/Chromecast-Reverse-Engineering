.class final Lctr;
.super Ljava/lang/Object;

# interfaces
.implements Lcwb;


# instance fields
.field private synthetic a:Lcto;


# direct methods
.method constructor <init>(Lcto;)V
    .locals 0

    iput-object p1, p0, Lctr;->a:Lcto;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lctr;->a:Lcto;

    .line 1000
    iget-boolean v0, v0, Lcto;->n:Z

    .line 0
    if-nez v0, :cond_0

    iget-object v0, p0, Lctr;->a:Lcto;

    const-wide/16 v2, 0x0

    .line 2000
    invoke-virtual {v0, v2, v3}, Lcto;->a(J)V

    .line 0
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 0
    check-cast p1, Lclv;

    .line 3000
    iget-object v0, p1, Lclv;->c:Lcjd;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lclv;->c:Lcjd;

    :goto_0
    iget-object v1, p0, Lctr;->a:Lcto;

    iget-wide v2, p1, Lclv;->a:J

    const/4 v4, 0x1

    invoke-static {v1, v0, v2, v3, v4}, Lcto;->a(Lcto;Lcjd;JZ)V

    .line 0
    return-void

    .line 3000
    :cond_0
    iget-object v1, p1, Lclv;->b:Lciz;

    new-instance v0, Lcjd;

    invoke-direct {v0}, Lcjd;-><init>()V

    iput-object v1, v0, Lcjd;->b:Lciz;

    const/4 v2, 0x0

    iput-object v2, v0, Lcjd;->a:[Lcjc;

    iget-object v1, v1, Lciz;->h:Ljava/lang/String;

    iput-object v1, v0, Lcjd;->c:Ljava/lang/String;

    goto :goto_0
.end method
