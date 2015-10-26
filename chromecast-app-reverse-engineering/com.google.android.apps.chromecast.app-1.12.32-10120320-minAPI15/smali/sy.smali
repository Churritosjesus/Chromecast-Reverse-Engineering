.class final Lsy;
.super Lra;
.source "PG"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 737
    new-instance v0, Lsz;

    invoke-direct {v0}, Lsz;-><init>()V

    sput-object v0, Lsy;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 727
    invoke-direct {p0, p1}, Lra;-><init>(Landroid/os/Parcel;)V

    .line 728
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lsy;->c:Z

    .line 729
    return-void

    .line 728
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 723
    invoke-direct {p0, p1}, Lra;-><init>(Landroid/os/Parcelable;)V

    .line 724
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 733
    invoke-super {p0, p1, p2}, Lra;->writeToParcel(Landroid/os/Parcel;I)V

    .line 734
    iget-boolean v0, p0, Lsy;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 735
    return-void

    .line 734
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
