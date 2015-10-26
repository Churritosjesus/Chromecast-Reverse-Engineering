.class public final Lcom/google/android/gms/people/model/AvatarReference;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcss;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcss;

    invoke-direct {v0}, Lcss;-><init>()V

    sput-object v0, Lcom/google/android/gms/people/model/AvatarReference;->CREATOR:Lcss;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, La;->a(Z)V

    iput p1, p0, Lcom/google/android/gms/people/model/AvatarReference;->a:I

    iput p2, p0, Lcom/google/android/gms/people/model/AvatarReference;->b:I

    iput-object p3, p0, Lcom/google/android/gms/people/model/AvatarReference;->c:Ljava/lang/String;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
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

    const-string v1, "source"

    iget v2, p0, Lcom/google/android/gms/people/model/AvatarReference;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    const-string v1, "location"

    iget-object v2, p0, Lcom/google/android/gms/people/model/AvatarReference;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbzr;->a(Ljava/lang/String;Ljava/lang/Object;)Lbzr;

    move-result-object v0

    invoke-virtual {v0}, Lbzr;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcss;->a(Lcom/google/android/gms/people/model/AvatarReference;Landroid/os/Parcel;)V

    return-void
.end method
