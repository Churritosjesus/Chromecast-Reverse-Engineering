.class public final Lcom/google/android/gms/people/identity/internal/AccountToken;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcri;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcri;

    invoke-direct {v0}, Lcri;-><init>()V

    sput-object v0, Lcom/google/android/gms/people/identity/internal/AccountToken;->CREATOR:Lcri;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/people/identity/internal/AccountToken;->a:I

    iput-object p2, p0, Lcom/google/android/gms/people/identity/internal/AccountToken;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/people/identity/internal/AccountToken;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcri;->a(Lcom/google/android/gms/people/identity/internal/AccountToken;Landroid/os/Parcel;)V

    return-void
.end method
