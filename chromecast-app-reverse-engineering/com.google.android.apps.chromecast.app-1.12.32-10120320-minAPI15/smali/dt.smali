.class final Ldt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 597
    .line 2601
    new-instance v0, Lds;

    .line 3513
    invoke-direct {v0, p1}, Lds;-><init>(Landroid/os/Parcel;)V

    .line 597
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 597
    .line 1606
    new-array v0, p1, [Lds;

    .line 597
    return-object v0
.end method
