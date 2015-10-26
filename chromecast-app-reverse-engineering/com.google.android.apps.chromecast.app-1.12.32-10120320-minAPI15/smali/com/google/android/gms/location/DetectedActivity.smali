.class public Lcom/google/android/gms/location/DetectedActivity;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcnc;


# instance fields
.field public final a:I

.field public b:I

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcnb;

    invoke-direct {v0}, Lcnb;-><init>()V

    new-instance v0, Lcnc;

    invoke-direct {v0}, Lcnc;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Lcnc;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/DetectedActivity;->a:I

    iput p2, p0, Lcom/google/android/gms/location/DetectedActivity;->b:I

    iput p3, p0, Lcom/google/android/gms/location/DetectedActivity;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 0
    iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->b:I

    .line 1000
    const/16 v1, 0xe

    if-le v0, v1, :cond_0

    const/4 v0, 0x4

    :cond_0
    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "DetectedActivity [type="

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/DetectedActivity;->a()I

    move-result v0

    .line 2000
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 0
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", confidence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/location/DetectedActivity;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2000
    :pswitch_1
    const-string v0, "IN_VEHICLE"

    goto :goto_0

    :pswitch_2
    const-string v0, "ON_BICYCLE"

    goto :goto_0

    :pswitch_3
    const-string v0, "ON_FOOT"

    goto :goto_0

    :pswitch_4
    const-string v0, "STILL"

    goto :goto_0

    :pswitch_5
    const-string v0, "UNKNOWN"

    goto :goto_0

    :pswitch_6
    const-string v0, "TILTING"

    goto :goto_0

    :pswitch_7
    const-string v0, "WALKING"

    goto :goto_0

    :pswitch_8
    const-string v0, "RUNNING"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcnc;->a(Lcom/google/android/gms/location/DetectedActivity;Landroid/os/Parcel;)V

    return-void
.end method
