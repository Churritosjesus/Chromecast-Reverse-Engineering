.class final Lcqk;
.super Lcqq;
.source "PG"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field final synthetic c:Lcqj;


# direct methods
.method public constructor <init>(Lcqj;Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcqk;->c:Lcqj;

    invoke-direct {p0, p1}, Lcqq;-><init>(Lcqp;)V

    .line 33
    iput-object p2, p0, Lcqk;->e:Landroid/widget/ImageView;

    .line 34
    iput-object p3, p0, Lcqk;->f:Ljava/lang/String;

    .line 35
    iput-object p4, p0, Lcqk;->b:Ljava/lang/String;

    .line 36
    iput p5, p0, Lcqk;->a:I

    .line 37
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 41
    sget-object v0, Lcpx;->d:Lcpt;

    iget-object v1, p0, Lcqk;->c:Lcqj;

    iget-object v1, v1, Lcqj;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcqk;->f:Ljava/lang/String;

    iget-object v3, p0, Lcqk;->b:Ljava/lang/String;

    iget v4, p0, Lcqk;->a:I

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lcpt;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;II)Lbwj;

    move-result-object v0

    new-instance v1, Lcql;

    invoke-direct {v1, p0}, Lcql;-><init>(Lcqk;)V

    .line 42
    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 50
    return-void
.end method
