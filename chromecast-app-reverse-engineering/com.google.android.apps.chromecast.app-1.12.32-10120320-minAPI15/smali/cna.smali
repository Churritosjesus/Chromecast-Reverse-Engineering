.class public final Lcna;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;
    .locals 10

    .prologue
    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    .line 0
    invoke-static {p0}, La;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v3, 0x0

    move-wide v4, v6

    move v2, v8

    :goto_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    .line 1000
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 2000
    const v9, 0xffff

    and-int/2addr v9, v1

    .line 0
    sparse-switch v9, :sswitch_data_0

    invoke-static {p0, v1}, La;->b(Landroid/os/Parcel;I)V

    goto :goto_0

    :sswitch_0
    sget-object v3, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Lcnc;

    invoke-static {p0, v1, v3}, La;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v1}, La;->d(Landroid/os/Parcel;I)I

    move-result v2

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v1}, La;->e(Landroid/os/Parcel;I)J

    move-result-wide v4

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v1}, La;->e(Landroid/os/Parcel;I)J

    move-result-wide v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0, v1}, La;->d(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-eq v1, v0, :cond_1

    new-instance v1, Ll;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Overread allowed size end="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p0}, Ll;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v1

    :cond_1
    new-instance v1, Lcom/google/android/gms/location/ActivityRecognitionResult;

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/location/ActivityRecognitionResult;-><init>(ILjava/util/List;JJI)V

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x3e8 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Lcom/google/android/gms/location/ActivityRecognitionResult;Landroid/os/Parcel;)V
    .locals 4

    .prologue
    .line 0
    .line 3000
    const/16 v0, 0x4f45

    invoke-static {p1, v0}, La;->m(Landroid/os/Parcel;I)I

    move-result v0

    .line 0
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 v1, 0x3e8

    .line 4000
    iget v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->a:I

    .line 0
    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->c:J

    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->d:J

    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->e:I

    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    .line 5000
    invoke-static {p1, v0}, La;->n(Landroid/os/Parcel;I)V

    .line 0
    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcna;->a(Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 6000
    new-array v0, p1, [Lcom/google/android/gms/location/ActivityRecognitionResult;

    .line 0
    return-object v0
.end method
