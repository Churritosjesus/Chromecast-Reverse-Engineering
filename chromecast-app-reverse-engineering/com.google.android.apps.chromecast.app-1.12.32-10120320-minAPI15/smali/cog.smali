.class public final Lcog;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/location/internal/ParcelableGeofence;Landroid/os/Parcel;)V
    .locals 5

    .prologue
    const/4 v4, 0x4

    .line 0
    .line 1000
    const/16 v0, 0x4f45

    invoke-static {p1, v0}, La;->m(Landroid/os/Parcel;I)I

    move-result v0

    .line 0
    const/4 v1, 0x1

    .line 2000
    iget-object v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->b:Ljava/lang/String;

    .line 0
    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x3e8

    .line 3000
    iget v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->a:I

    .line 0
    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    const/4 v1, 0x2

    .line 4000
    iget-wide v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->c:J

    .line 0
    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;IJ)V

    .line 5000
    iget-short v1, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->d:S

    .line 6000
    const/4 v2, 0x3

    invoke-static {p1, v2, v4}, La;->b(Landroid/os/Parcel;II)V

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 7000
    iget-wide v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->e:D

    .line 0
    invoke-static {p1, v4, v2, v3}, La;->a(Landroid/os/Parcel;ID)V

    const/4 v1, 0x5

    .line 8000
    iget-wide v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->f:D

    .line 0
    invoke-static {p1, v1, v2, v3}, La;->a(Landroid/os/Parcel;ID)V

    const/4 v1, 0x6

    .line 9000
    iget v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->g:F

    .line 0
    invoke-static {p1, v1, v2}, La;->a(Landroid/os/Parcel;IF)V

    const/4 v1, 0x7

    .line 10000
    iget v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->h:I

    .line 0
    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    const/16 v1, 0x8

    .line 11000
    iget v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->i:I

    .line 0
    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    const/16 v1, 0x9

    .line 12000
    iget v2, p0, Lcom/google/android/gms/location/internal/ParcelableGeofence;->j:I

    .line 0
    invoke-static {p1, v1, v2}, La;->c(Landroid/os/Parcel;II)V

    .line 13000
    invoke-static {p1, v0}, La;->n(Landroid/os/Parcel;I)V

    .line 0
    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 18

    .prologue
    .line 0
    .line 15000
    invoke-static/range {p1 .. p1}, La;->a(Landroid/os/Parcel;)I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-ge v3, v2, :cond_0

    .line 16000
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 17000
    const v17, 0xffff

    and-int v17, v17, v3

    .line 15000
    sparse-switch v17, :sswitch_data_0

    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->b(Landroid/os/Parcel;I)V

    goto :goto_0

    :sswitch_0
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->h(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->d(Landroid/os/Parcel;I)I

    move-result v4

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->e(Landroid/os/Parcel;I)J

    move-result-wide v13

    goto :goto_0

    .line 18000
    :sswitch_3
    const/4 v7, 0x4

    move-object/from16 v0, p1

    invoke-static {v0, v3, v7}, La;->a(Landroid/os/Parcel;II)V

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    int-to-short v7, v3

    .line 15000
    goto :goto_0

    :sswitch_4
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->g(Landroid/os/Parcel;I)D

    move-result-wide v8

    goto :goto_0

    :sswitch_5
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->g(Landroid/os/Parcel;I)D

    move-result-wide v10

    goto :goto_0

    :sswitch_6
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->f(Landroid/os/Parcel;I)F

    move-result v12

    goto :goto_0

    :sswitch_7
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->d(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_0

    :sswitch_8
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->d(Landroid/os/Parcel;I)I

    move-result v15

    goto :goto_0

    :sswitch_9
    move-object/from16 v0, p1

    invoke-static {v0, v3}, La;->d(Landroid/os/Parcel;I)I

    move-result v16

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v3

    if-eq v3, v2, :cond_1

    new-instance v3, Ll;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Overread allowed size end="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-direct {v3, v2, v0}, Ll;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v3

    :cond_1
    new-instance v3, Lcom/google/android/gms/location/internal/ParcelableGeofence;

    invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/location/internal/ParcelableGeofence;-><init>(ILjava/lang/String;ISDDFJII)V

    .line 0
    return-object v3

    .line 15000
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0x3e8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 0
    .line 14000
    new-array v0, p1, [Lcom/google/android/gms/location/internal/ParcelableGeofence;

    .line 0
    return-object v0
.end method
