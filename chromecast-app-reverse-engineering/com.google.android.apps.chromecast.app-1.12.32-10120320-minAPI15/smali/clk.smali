.class public final Lclk;
.super Lcqc;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic g:I


# direct methods
.method public constructor <init>(Lcpv;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V
    .locals 0

    iput-object p3, p0, Lclk;->a:Ljava/lang/String;

    iput p4, p0, Lclk;->g:I

    invoke-direct {p0, p2}, Lcqc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcsa;

    .line 1000
    iget-object v0, p0, Lclk;->a:Ljava/lang/String;

    iget v1, p0, Lclk;->g:I

    invoke-virtual {p1, p0, v0, v1}, Lcsa;->a(Lbwq;Ljava/lang/String;I)V

    .line 0
    return-void
.end method
