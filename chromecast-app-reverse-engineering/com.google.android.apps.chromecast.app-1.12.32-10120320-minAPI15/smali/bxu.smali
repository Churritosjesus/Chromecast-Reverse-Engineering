.class public abstract Lbxu;
.super Ljava/lang/Object;

# interfaces
.implements Lbxv;


# instance fields
.field public final a:Lcom/google/android/gms/common/data/DataHolder;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 1000
    iput-object p0, v0, Lcom/google/android/gms/common/data/DataHolder;->i:Ljava/lang/Object;

    .line 0
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->c()V

    :cond_0
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 0
    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lbxu;->a:Lcom/google/android/gms/common/data/DataHolder;

    .line 2000
    iget v0, v0, Lcom/google/android/gms/common/data/DataHolder;->h:I

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lbxz;

    invoke-direct {v0, p0}, Lbxz;-><init>(Lbxv;)V

    return-object v0
.end method
