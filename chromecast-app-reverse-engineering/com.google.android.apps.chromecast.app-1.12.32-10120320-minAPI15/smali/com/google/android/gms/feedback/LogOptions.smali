.class public Lcom/google/android/gms/feedback/LogOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final a:I

.field public b:Ljava/lang/String;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcij;

    invoke-direct {v0}, Lcij;-><init>()V

    sput-object v0, Lcom/google/android/gms/feedback/LogOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/feedback/LogOptions;->a:I

    iput-object p2, p0, Lcom/google/android/gms/feedback/LogOptions;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/feedback/LogOptions;->c:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcij;->a(Lcom/google/android/gms/feedback/LogOptions;Landroid/os/Parcel;)V

    return-void
.end method
