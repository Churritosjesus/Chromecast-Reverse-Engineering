.class public final Lcqn;
.super Lcqq;
.source "PG"


# instance fields
.field public final a:I

.field final synthetic b:Lcqm;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcqm;Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcqn;->b:Lcqm;

    invoke-direct {p0, p1}, Lcqq;-><init>(Lcqp;)V

    .line 40
    iput-object p2, p0, Lcqn;->e:Landroid/widget/ImageView;

    .line 41
    iput-object p3, p0, Lcqn;->f:Ljava/lang/String;

    .line 42
    iput-object p4, p0, Lcqn;->c:Ljava/lang/String;

    .line 43
    iput p5, p0, Lcqn;->a:I

    .line 44
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 48
    sget-object v0, Lcpx;->d:Lcpt;

    iget-object v1, p0, Lcqn;->b:Lcqm;

    iget-object v1, v1, Lcqm;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcqn;->f:Ljava/lang/String;

    iget-object v3, p0, Lcqn;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcpt;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lbwj;

    move-result-object v0

    new-instance v1, Lcqo;

    invoke-direct {v1, p0}, Lcqo;-><init>(Lcqn;)V

    .line 49
    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 55
    return-void
.end method
