.class public final Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field public static final a:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;


# instance fields
.field public final b:I

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcnm;

    invoke-direct {v0}, Lcnm;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->a:Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->b:I

    iput-boolean p2, p0, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;->c:Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, v0}, Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;-><init>(IZ)V

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

    invoke-static {p0, p1}, Lcnm;->a(Lcom/google/android/gms/location/copresence/internal/CopresenceApiOptions;Landroid/os/Parcel;)V

    return-void
.end method
