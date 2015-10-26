.class public final Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcro;


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcro;

    invoke-direct {v0}, Lcro;-><init>()V

    sput-object v0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->CREATOR:Lcro;

    return-void
.end method

.method public constructor <init>(IZZZLjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->c:Z

    iput-object p5, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->d:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->e:Z

    if-nez p6, :cond_0

    new-instance p6, Landroid/os/Bundle;

    invoke-direct {p6}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p6, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->f:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, La;->b(Ljava/lang/Object;)Lbzr;

    move-result-object v0

    const-string v1, "useOfflineDatabase"

    iget-boolean v2, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    const-string v1, "useWebData"

    iget-boolean v2, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    const-string v1, "useCP2"

    iget-boolean v2, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    const-string v1, "endpoint"

    iget-object v2, p0, Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    invoke-virtual {v0}, Lbzr;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcro;->a(Lcom/google/android/gms/people/identity/internal/ParcelableListOptions;Landroid/os/Parcel;)V

    return-void
.end method
