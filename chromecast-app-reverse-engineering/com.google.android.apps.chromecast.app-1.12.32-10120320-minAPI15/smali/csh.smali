.class final Lcsh;
.super Ljava/lang/Object;

# interfaces
.implements Lcpr;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcsr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcsr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcsh;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcsh;->b:Lcsr;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lcsh;->b:Lcsr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcsh;->b:Lcsr;

    .line 1000
    invoke-virtual {v0}, Lbxu;->a()V

    .line 0
    :cond_0
    return-void
.end method

.method public final b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcsh;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final c()Lcsr;
    .locals 1

    iget-object v0, p0, Lcsh;->b:Lcsr;

    return-object v0
.end method
